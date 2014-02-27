// https://developers.google.com/drive/v1/reference/files/insert#examples
// https://developers.google.com/drive/v2/reference/
// Uses the Java client library: https://developers.google.com/drive/downloads 
// and http://code.google.com/p/google-api-java-client/wiki/APIs and hit download button to pull .zip - has loads of java samples
// - this is a partial implementation !!!
import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;

import java.io.IOException;
import java.util.Arrays;
// ...

public class GoogleDrive {

  // ... need Drive declaration

  /**
   * Insert new file.
   *
   * @param service Drive API service instance.
   * @param title Title of the file to insert, including the extension.
   * @param description Description of the file to insert.
   * @param parentId Optional parent folder's ID.
   * @param mimeType MIME type of the file to insert.
   * @param filename Filename of the file to insert.
   * @return Inserted file metadata if successful, {@code null} otherwise.
   */
  private static File insertFile(Drive service, String title, String description,
      String parentId, String mimeType, String filename) {
    // File's metadata.
    File body = new File();
    body.setTitle(title);
    body.setDescription(description);
    body.setMimeType(mimeType);

    // Set the parent folder.
    if (parentId != null && parentId.length() > 0) {
      body.setParentsCollection(
          Arrays.asList(new File.ParentsCollection().setId(parentId));
    }

    // File's content.
    java.io.File fileContent = new java.io.File(filename);
    FileContent mediaContent = new FileContent(mimeType, fileContent);
    try {
      File file = service.files().insert(body, mediaContent).execute();

      // Uncomment the following line to print the File ID.
      // System.out.println("File ID: %s" + file.getId());

      return file;
    } catch (IOException e) {
      System.out.println("An error occured: " + e);
      return null;
    }
  }

  // ...
}