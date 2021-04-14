package mk.ukim.finki.emtlibrary.repository;

import mk.ukim.finki.emtlibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
