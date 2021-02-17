package com.cd.casestudy.repository;


import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.cd.casestudy.dto.AlbumDTO;
import com.cd.casestudy.model.Album;


@Repository
public interface AlbumRepository extends PagingAndSortingRepository<Album, Long>{

	AlbumDTO save(AlbumDTO album);
	AlbumDTO save(List<AlbumDTO> album);
}
