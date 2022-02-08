import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortWordFilter{

    public interface Predicate {
        boolean accept(Word w);
    }

    static class Word {
        public String word;
        public Word(String word) {
            this.word = word;
        }
    }

    public static void main(String args[]) {
        Predicate predicateForLength = (e) -> e.word.length() < 5;
        ArrayList<String> words = new ArrayList<>();

        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec;

        try {
            File workingDirectory = new File(System.getProperty("user.dir"));

            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                int line = 0;
                while(reader.ready()) {
                    rec = reader.readLine();
                    line++;

                    words.add(rec);
                }
                reader.close();
                System.out.println("\n\nData file read!");
                System.out.println(words);

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Words larger than 5 characters: ");

        for (String candidate : words) {
            Word newWord = new Word(candidate);
            if (predicateForLength.accept(newWord)) {
                System.out.println(newWord.word);
            }
        }


    }

}

