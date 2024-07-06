package bg.softuni.hrm_users.repository;

import bg.softuni.hrm_users.model.entity.Education;
import bg.softuni.hrm_users.model.enums.EducationName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
    Education findByEducationName(EducationName educationName);
}