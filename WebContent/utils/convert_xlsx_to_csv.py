import os
import pandas as pd

# Diretório do script Python
script_dir = os.path.dirname(os.path.abspath(__file__))

# Diretório contendo os arquivos .xlsx
dir_path = os.path.join(script_dir, '..', '..', 'Public', 'Assets', 'Data')

print(dir_path)

# Obtém uma lista de arquivos no diretório
files = os.listdir(dir_path)

# Itera sobre todos os arquivos no diretório
for file in files:
    # Verifica se o arquivo possui a extensão .xlsx
    if file.endswith('.xlsx'):
        # Constrói o caminho completo para o arquivo Excel
        excel_path = os.path.join(dir_path, file)
        
        # Carrega o arquivo Excel
        excel_file = pd.ExcelFile(excel_path)

        # Itera sobre as abas (sheets) se houver mais de uma
        for sheet_name in excel_file.sheet_names:
            df = excel_file.parse(sheet_name)

            # Constrói o caminho completo para salvar o CSV no mesmo diretório
            csv_filename = f'{file.split(".")[0]}_{sheet_name}.csv'
            csv_path = os.path.join(script_dir, '..', '..', 'Public', 'Assets', 'Data', csv_filename)

            # Salva o DataFrame como CSV
            df.to_csv(csv_path, index=False)