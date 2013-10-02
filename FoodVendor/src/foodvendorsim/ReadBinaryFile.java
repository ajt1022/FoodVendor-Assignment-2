package foodvendorsim;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadBinaryFile {

	public Object readItem;

		public ReadBinaryFile(String fileName) {
			try {
				ObjectInputStream input = new ObjectInputStream(
						new FileInputStream(fileName));
				try {
					while (true) {

						readItem = input.readObject();
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EOFException e) {
					System.out.println();
				}
				input.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public Object getReadItem() {
			return readItem;
		}
	
}
