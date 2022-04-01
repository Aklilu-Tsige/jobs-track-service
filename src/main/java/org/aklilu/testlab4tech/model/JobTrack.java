package org.aklilu.testlab4tech.model;

import java.time.LocalDate;
import java.util.List;

public class JobTrack {
    private Long id;
    private String jopTitle;
    private LocalDate applyDate;
    private String jopDescription;
    private List<ContactEnterprise> contactEnterprises;
    private Enterprise enterpriseInfo;
    private List<String> remarkOrInfo;
}
