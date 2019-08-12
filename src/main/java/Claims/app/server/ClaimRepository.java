package Claims.app.server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClaimRepository extends CrudRepository<CLAIM, Integer>{

	CLAIM findByClaimNumber(String claimNumber);
	
}
