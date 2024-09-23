import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupFiles {

    public static void cerateBackup(Path from, Path to) throws IOException {

        Files.createDirectories(to);

        DirectoryStream<Path> stream = Files.newDirectoryStream(from);
        for (Path file : stream) {
            if (Files.isRegularFile(file)) {
                Files.copy(
                        file,
                        to.resolve(file.getFileName()),
                        StandardCopyOption.REPLACE_EXISTING
                );
                System.out.println("Скопирован файл: " + file.getFileName());
            }
        }

    }

}
