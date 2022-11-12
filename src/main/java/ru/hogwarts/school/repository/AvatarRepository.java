package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.model.Avatar;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    @Override
    Optional<Avatar> findById(Long id);

    Optional<Avatar> findByStudentId(Long id);
}
