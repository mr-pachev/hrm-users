package bg.softuni.hrm_users.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project extends BaseEntity{
    @NotBlank
    private String name;
    @NotBlank
    @Column(columnDefinition = "TEXT")
    private String description;
    @NotEmpty
    private LocalDate startDate;
    @NotEmpty
    private LocalDate endData;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department responsibleDepartment;
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndData() {
        return endData;
    }

    public void setEndData(LocalDate endData) {
        this.endData = endData;
    }

    public Department getResponsibleDepartment() {
        return responsibleDepartment;
    }

    public void setResponsibleDepartment(Department responsibleDepartment) {
        this.responsibleDepartment = responsibleDepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}