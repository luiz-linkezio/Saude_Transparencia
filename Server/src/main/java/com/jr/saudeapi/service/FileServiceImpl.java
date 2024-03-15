package com.jr.saudeapi.service;

import com.jr.saudeapi.entity.Gasto;
import com.jr.saudeapi.repository.UserRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private UserRepository repository;

    @Override
    public boolean hasCsvFormat(MultipartFile file) {
        String type = "text/csv";
        return type.equals(file.getContentType());
    }

    @Override
    public void processAndSaveData(MultipartFile file) {
        try {
            List<Gasto> gastos =csvToUsers(file.getInputStream());
            repository.saveAll(gastos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Gasto> csvToUsers(InputStream inputStream) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
            List<Gasto> gastos = new ArrayList<Gasto>();
            boolean isHeader = false;
            String headerType = "Ano, Mês, UF, Região, UG Responsável, Funcional, Função, Subfunção, Programa, Ação, Esfera, Categoria Econômica, GND, Mod. Aplicação, Empenho, Observação, Emp_Ano_Emissão, Empenhado, Liquidado, Pago, RP Pago, Despesa Executada";
            List<CSVRecord> records = csvParser.getRecords();
            for(CSVRecord csvRecord : records) {
                String csvString = csvRecord.toString();
                if(csvString.contains(headerType)){
                    isHeader = true;
                }
//                if(isHeader) {
                    Gasto gasto = new Gasto(csvRecord.get("Ano"),
                            csvRecord.get("Mês"),
                            csvRecord.get("UF"),
                            csvRecord.get("Região"),
                            csvRecord.get("UG Responsável"),
                            csvRecord.get("Funcional"),
                            csvRecord.get("Função"),
                            csvRecord.get("Subfunção"),
                            csvRecord.get("Programa"),
                            csvRecord.get("Ação"),
                            csvRecord.get("Esfera"),
                            csvRecord.get("Categoria Econômica"),
                            csvRecord.get("GND"),
                            csvRecord.get("Mod. Aplicação"),
                            csvRecord.get("Empenho"),
                            csvRecord.get("Observação"),
                            csvRecord.get("Emp_Ano_Emissão"),
                            csvRecord.get("Empenhado"),
                            csvRecord.get("Liquidado"),
                            csvRecord.get("Pago"),
                            csvRecord.get("RP Pago"),
                            csvRecord.get("Despesa Executada"));
                    gastos.add(gasto);
                }
//            }
            return gastos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
