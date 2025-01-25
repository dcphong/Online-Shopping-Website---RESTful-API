package com.final_test_sof3012.sof3022_ass_restful_api.Repositories;

import com.final_test_sof3012.sof3022_ass_restful_api.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {
}
