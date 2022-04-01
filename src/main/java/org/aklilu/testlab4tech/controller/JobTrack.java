package org.aklilu.testlab4tech.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobTrack {

    List<String> jobsTracksList = new ArrayList<>();
    {
        jobsTracksList.add("Job 1");
        jobsTracksList.add("job 2");
        jobsTracksList.add("job .");
        jobsTracksList.add("job n");
    }


    @GetMapping("/jobTracks")
    public List<String> getJobsTracksList() {
        return jobsTracksList;
    }
}
