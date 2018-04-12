package highi.sf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.spring.ServiceBean;
import com.sf.service.EmpService;

@Configuration
public class DubboProviderConfig {

	@Bean
	public ServiceBean<EmpService>  empService(EmpService empService){
		ServiceBean<EmpService> serviceBean = new ServiceBean<EmpService>();
		serviceBean.setInterface(EmpService.class.getName());
		serviceBean.setRef(empService);
		return serviceBean;
	}
	
}
