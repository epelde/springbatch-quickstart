package epelde.github.com.sample1.job;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;


public class PrintTasklet implements Tasklet {
	
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {
		System.out.println("\n\n");		
		System.out.println("                            ((((c,               ,7))))");
		System.out.println("                            (((((((              ))))))))");
		System.out.println("                             (((((((            ))))))))");
		System.out.println("                              ((((((@@@@@@@@@@@))))))))");
		System.out.println("                               @@@@@@@@@@@@@@@@)))))))");
		System.out.println("                            @@@@@@@@@@@@@@@@@@))))))@@@@");
		System.out.println("                           @@/,:::,\\/,:::,\\@@@@@@@@@@@@@@");
		System.out.println("                           @@|:::::||:::::|@@@@@@@@@@@@@@@");
		System.out.println("                           @@\':::'/\':::'/@@@@@@@@@@@@@@");
		System.out.println("                            @@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("                              @@@@@@@@@@@@@@@@@@@@@@\\");
		System.out.println("                                 /    \\        (     \\");
		System.out.println("                                (      )        \\     \\");
		System.out.println("                                 \\    /          \\		");
		System.out.println("\n\n");
		return RepeatStatus.FINISHED;
	}
	    
}
