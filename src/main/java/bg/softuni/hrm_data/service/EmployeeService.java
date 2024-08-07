package bg.softuni.hrm_data.service;


import bg.softuni.hrm_data.model.dto.AddEmployeeDTO;
import bg.softuni.hrm_data.model.dto.EmployeeDTO;
import bg.softuni.hrm_data.model.dto.EmployeeNameDTO;

import java.util.List;

public interface EmployeeService {
    //get all employees names
    List<EmployeeNameDTO> allEmployeesNames();

    //get all employees
    List<EmployeeDTO> getAllEmployees();

    //add new employee
    EmployeeDTO addEmployee(AddEmployeeDTO addEmployeeDTO);

    //get employee by id
    EmployeeDTO getEmployeeByID(long id);

    //edit employee
    void editEmployee(EmployeeDTO employeeDTO);

    //delete employee
    void removeEmployee(long id);
}
