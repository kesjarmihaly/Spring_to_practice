package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Job {

    private String jobName;
    @Id
    private Integer jobId;

    public Job() {
    }

    public Job(String jobName, Integer jobId) {
        this.jobName = jobName;
        this.jobId = jobId;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobName='" + jobName + '\'' +
                ", jobId=" + jobId +
                '}';
    }
}
