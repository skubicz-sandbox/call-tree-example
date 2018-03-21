package org.calltree.repositories;

import org.calltree.domain.model.Account;

/**
 * Repository for accounts.
 */
public interface AccountRepository {

    /**
     * Load account.
     *
     * @param accountId account ID
     *
     * @return account
     */
    Account load(long accountId);
}