import java.io.*;
public class DeleteCarRecord {
    public static void removeRecord(String filePath, String removeTerm, int positionOfTerm, String delimiter) {
        int position = positionOfTerm - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        String currentLine;
        String data[];
        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine())!=null) {
                data = currentLine.split(delimiter);
                if (!(data[position].equalsIgnoreCase(removeTerm))) {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(filePath);
            newFile.renameTo(dump);

        }
        catch(Exception e){

        }
    }
}
