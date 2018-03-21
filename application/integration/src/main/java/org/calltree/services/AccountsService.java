package org.calltree.services;

import org.calltree.domain.model.Account;
import org.calltree.repositories.AccountRepository;
import org.calltree.repositories.AccountsMockRepository;

/**
 * Application services for account operation.
 */
public class AccountsService {
    private AccountRepository accountRepository = new AccountsMockRepository();

    /**
     * Get account by ID.
     *
     * @param accountId account ID
     *
     * @return account
     */
    private Account getAccount(long accountId) {
        return accountRepository.load(accountId);
    }

}