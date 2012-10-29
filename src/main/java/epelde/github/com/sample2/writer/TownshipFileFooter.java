package epelde.github.com.sample2.writer;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.item.file.FlatFileFooterCallback;

public class TownshipFileFooter extends StepExecutionListenerSupport implements FlatFileFooterCallback {
	
	private StepExecution stepExecution;

	public void writeFooter(Writer writer) throws IOException {
		writer.write("================\n");
		writer.write("#townships:" + this.stepExecution.getWriteCount() + "\n");
		writer.write("================\n");
	}
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}	
	

}
