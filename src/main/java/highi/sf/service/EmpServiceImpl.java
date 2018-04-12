package highi.sf.service;

import org.springframework.stereotype.Service;

import com.sf.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Override
	public String queryAll() {
		return "已经查询所有！";
	}

}
