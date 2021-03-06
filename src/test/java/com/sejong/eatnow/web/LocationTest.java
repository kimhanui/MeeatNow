package com.sejong.eatnow.web;

import com.sejong.eatnow.domain.location.LocationRepository;
import com.sejong.eatnow.web.dto.LocationDto;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Log
@Commit
@NoArgsConstructor
public class LocationTest {

    @Autowired
    private LocationRepository repo;

    @Test
    public void isSave() {
        LocationDto dto = new LocationDto(111.1, 222.3);
        try {
            repo.saveAndFlush(dto.toEntity());
            log.info("saved successfully....");
        } catch(Exception e){
            log.warning("save failed...."+e.getMessage());
        }

    }

}
