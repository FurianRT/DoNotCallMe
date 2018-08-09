// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.furianrt.donotcallme.main.whitelist;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class WhiteListFragment_MembersInjector implements MembersInjector<WhiteListFragment> {
  private final Provider<WhiteListContract.Presenter> mPresenterProvider;

  public WhiteListFragment_MembersInjector(
      Provider<WhiteListContract.Presenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<WhiteListFragment> create(
      Provider<WhiteListContract.Presenter> mPresenterProvider) {
    return new WhiteListFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(WhiteListFragment instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      WhiteListFragment instance, WhiteListContract.Presenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
