package com.ictproject.moviemate.domain.review.service;

import com.ictproject.moviemate.domain.review.Review;

import com.ictproject.moviemate.domain.review.dto.ReviewDetailResponseDTO;
import com.ictproject.moviemate.domain.review.dto.ReviewModifyRequestDTO;
import com.ictproject.moviemate.domain.review.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReviewService {

	private final ReviewMapper reviewMapper;

	public List<ReviewDetailResponseDTO> getReview(String movieCd) {
		return reviewMapper.findReviewsByMovie(movieCd);
	}

	public List<ReviewDetailResponseDTO> getReview(int userId) {
		return reviewMapper.findReviewsByUser(userId);
	}

	public void insertReview(Review review) {
		reviewMapper.insertReview(review);
	}

	public void deleteReview(int reviewId) {
		reviewMapper.deleteReview(reviewId);
	}

	public void modifyReview(ReviewModifyRequestDTO reviewModifyRequestDTO){
		reviewMapper.modifyReview(reviewModifyRequestDTO);
	}
}
