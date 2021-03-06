// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.furianrt.donotcallme.contacts;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class ContactActivity_MembersInjector implements MembersInjector<ContactActivity> {
  private final Provider<ContactContract.Presenter> mPresenterProvider;

  public ContactActivity_MembersInjector(Provider<ContactContract.Presenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ContactActivity> create(
      Provider<ContactContract.Presenter> mPresenterProvider) {
    return new ContactActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ContactActivity instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static void injectMPresenter(
      ContactActivity instance, ContactContract.Presenter mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
