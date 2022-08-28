import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("source_file"))) {
            String newString;
            while ((newString = bufferedReader.readLine())!=null){
                text.append(newString).append(" ").append(newString.length()).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter fileWriter = new FileWriter("target_file", false)){
            fileWriter.write(text.toString());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}