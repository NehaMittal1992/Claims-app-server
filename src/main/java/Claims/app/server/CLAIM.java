package Claims.app.server;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "CLAIM")
public class CLAIM {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claimId;
	private String claimNumber;
	private String claimType;
//	private Date claimDate;
	private int policyId;
	
	 public CLAIM() {
	    }

	    public CLAIM(int claimId, String claimNumber, String claimType, int policyId) {
	        this.claimId = claimId;
	        this.claimNumber = claimNumber;
	        this.claimType = claimType;
	        this.policyId = policyId;
	    }
	
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	
	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	
//	@Column(name="clm_date")
//	public Date getClaimDate() {
//		return claimDate;
//	}
//	public void setClaimDate(Date claimDate) {
//		this.claimDate = claimDate;
//	}
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	
	

}
