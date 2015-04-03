package com.pactera.pdts.domain.shared;

/**
 * Entity mentioned in the DDD
 * @author wenhui.yang
 *
 * @param <T>
 */
public interface Entity<T> {

  /**
   * Entities compare by identity, not by attributes.
   *
   * @param other The other entity.
   * @return true if the identities are the same, regardles of other attributes.
   */
  boolean sameIdentityAs(T other);

}