package lokesh_Spring_5_AOC.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"lokesh_Spring_5_AOC.beans","lokesh_Spring_5_AOC.service"})
@EnableAspectJAutoProxy
public class Spring_Config {
	
}
