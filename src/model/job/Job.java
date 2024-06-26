package model.job;

import model.company.*;

public class Job {
	private String jobId;
    private Company associatedCompany; 
    private String jobName;
    private String jobLink;

    public Job(String jobId, Company associatedCompany, String jobName, String jobLink) {
        this.jobId = jobId;
        this.associatedCompany = associatedCompany;
        this.jobName = jobName;
        this.jobLink = jobLink;
    }

    public String getJobId() {
        return jobId;
    }

    public Company getAssociatedCompany() {
        return associatedCompany;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setAssociatedCompany(Company associatedCompany) {
        this.associatedCompany = associatedCompany;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

	
	
}
