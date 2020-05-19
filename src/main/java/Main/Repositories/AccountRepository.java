package Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Main.Models.Account.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
