
package com.example.EmployeeManagement;

import com.example.EmployeeManagement.exceptions.EmployeeNotFoundException;
import com.example.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
EmployeeRepository employeeRepository;
public List<Employee> getAll(){
return  employeeRepository.findAll();
}

    @Override
    public Employee getEmployeeDetail(int id) {
        Optional<Employee> empOpt=employeeRepository.findById(id);
        if(empOpt.isPresent()){
            return empOpt.get();
        }
       throw new EmployeeNotFoundException("employee not found!!!!");
    }

    @Override
    public Employee saveDetails(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public Boolean deleteEmployee(int id) {
        return null;
    }




}
