package com.example.whisky_tracker.components;

import com.example.whisky_tracker.models.Distillery;
import com.example.whisky_tracker.models.Whisky;
import com.example.whisky_tracker.repositories.DistilleryRepository;
import com.example.whisky_tracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        Distillery distillery1 = new Distillery("Glendronach", "Highland");
        distilleryRepository.save(distillery1);

        Distillery distillery2 = new Distillery("Highland Park", "Island");
        distilleryRepository.save(distillery2);

        Distillery distillery3 = new Distillery("Macallan", "Speyside");
        distilleryRepository.save(distillery3);

        Distillery distillery4 = new Distillery("Talisker", "Island");
        distilleryRepository.save(distillery4);

        Whisky whisky1 = new Whisky("The Glendronach Revival", 15, 2018, distillery1);
        whiskyRepository.save(whisky1);

        Whisky whisky2 = new Whisky("The Glendronach Original", 12, 2018, distillery1);
        whiskyRepository.save(whisky2);

        Whisky whisky3 = new Whisky("Viking Honour", 12, 2017, distillery2);
        whiskyRepository.save(whisky3);

        Whisky whisky4 = new Whisky("The Macallan Anniversary Malt", 25, 1995, distillery3);
        whiskyRepository.save(whisky4);

        Whisky whisky5 = new Whisky("Storm", 10, 2013, distillery4);
        whiskyRepository.save(whisky5);

        Whisky whisky6 = new Whisky("Skye" , 1, 2015, distillery4);
        whiskyRepository.save(whisky6);
    }
}
