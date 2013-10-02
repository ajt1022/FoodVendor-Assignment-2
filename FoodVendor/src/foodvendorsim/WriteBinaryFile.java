package foodvendorsim;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteBinaryFile {

	private ObjectOutputStream output;

	public WriteBinaryFile(String fileName, Object food) {
		try {
			output = new ObjectOutputStream(new FileOutputStream(fileName));
			output.writeObject(food);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
