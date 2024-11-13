package com.re_book.repository;

import com.re_book.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {

//    Page<Review> findByBookId(String bookId, Pageable page);

    Page<Review> findByBookIdOrderByCreatedDateDesc(String bookId, Pageable pageable);
}
