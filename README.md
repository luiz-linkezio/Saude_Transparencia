# Saúde Transparência
O projeto consiste em extrair dados de gastos com saúde pública de uma planilha e realizar tratamento, organização e exposição dos dados de forma que seja apresentável.

Projeto da cadeira de Contabilidade de Custos e Gerencial, da graduação em [Sistemas de Informação (SI)](https://portal.cin.ufpe.br/graduacao/sistemas-de-informacao/) do [Centro de Informática (CIN)](https://portal.cin.ufpe.br/) da [Universidade Federal de Pernambuco (UFPE)](https://www.ufpe.br/), cadeira cursada pela equipe em 2023 e 2024.

## Ementa da Cadeira
Fundamentos de Contabilidade de Custos e Gerencial. Métodos de Custeio para Avaliação de Estoques e Mensuração do Lucro e para o Processo de Tomada de Decisão. Informações para Tomada de Decisão. Mensuração de Custos Relevantes para a Tomada de Decisão. Custos para Controle. Contabilidade por Responsabilidade.

## Requesitos 
- [Git 2.43.0 +](https://www.git-scm.com/downloads)
### Backend
- [Java 17 +](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.9.6 +](https://maven.apache.org/download.cgi)

### Banco de Dados
- [MySQL 8.0.34 +](https://dev.mysql.com/downloads/installer/)
  - mysql-server
  - mysql workbench

[Como Instalar? (windows)](https://www.youtube.com/watch?v=a5ul8o76Hqw)

 *OBS: Colocar a senha padrão do mysql workbench como “password”*

## Iniciando o Projeto

### Banco de Dados
Para iniciar o banco de dados, basta abrir o MySQL Workbench e importar as tabelas  localizadas [nesse link](https://drive.google.com/drive/folders/1HjAPjiCqwpUpIppq04gy0iQKbX5dy1SY?usp=sharing) seguindo os seguintes passos:

1) Criar um novo schema chamado `saude`
2) [Importar as tabelas](https://www.youtube.com/watch?v=016N1WIyKdQ) no schema saude

### Backend
Para iniciar o servidor backend java, basta abrir a pasta ``Server`` em seu editor de código favorito e executar o arquivo ``Server/src/main/java/com/jr/saudeapi/SaudeApiApplication.java``.

*OBS: É nescessário configurar o banco de dados!*

### Gerando arquivo .csv a partir de arquivos .xlsx
Para gerar o arquivo .csv a partir de arquivos .xlsx, basta executar o código  ``WebContent/utils/convert_xlsx_to_csv.py`` que todos os arquivos .xlsl çocalizados na pasta Public/Assets/Data serão convertidos para .csv e armazenado nessa mesma pasta.

*OBS: É nescessário a instalção da biblioteca `pandas` do python!*