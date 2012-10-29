package epelde.github.com.sample2.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

public class TownshipFileHeader implements FlatFileHeaderCallback {

	public void writeHeader(Writer writer) throws IOException {
		writer.write("================\n");
		writer.write("date:" + new Date(System.currentTimeMillis()) + "\n");
		writer.write("================");
	}

}
