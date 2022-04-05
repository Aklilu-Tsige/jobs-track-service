package org.aklilu.testlab4tech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Table(name="job_track")
//@Entity
public class JobTrack {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String titleName;
    private String description;
    private String responsibility;
    private String requirementGeneral;
    private String requirementTechnical;
    private Long yearExperienceMin;
    private LocalDate postulateDate;
    private LocalDate publicationDate;
    private Enterprise enterpriseInfo;
    private List<EnterpriseContact> enterpriseContacts;
    private String remarkOrInfo;


}
