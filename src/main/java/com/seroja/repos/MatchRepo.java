package com.seroja.repos;

import com.seroja.domain.MatchInfo;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepo extends CrudRepository<MatchInfo, Integer> {
}
