package com.babyspeak.speechtracker.models.data;

import com.babyspeak.speechtracker.models.bWordsInitial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BwordsInitialRepository extends CrudRepository<bWordsInitial,Integer> {
}
