// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.furianrt.donotcallme.di.presenter;

import com.furianrt.donotcallme.contacts.ContactContract;
import com.furianrt.donotcallme.data.DataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class PresenterModule_ProvideContactPresenterFactory
    implements Factory<ContactContract.Presenter> {
  private final PresenterModule module;

  private final Provider<DataManager> dataManagerProvider;

  public PresenterModule_ProvideContactPresenterFactory(
      PresenterModule module, Provider<DataManager> dataManagerProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
  }

  @Override
  public ContactContract.Presenter get() {
    return Preconditions.checkNotNull(
        module.provideContactPresenter(dataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ContactContract.Presenter> create(
      PresenterModule module, Provider<DataManager> dataManagerProvider) {
    return new PresenterModule_ProvideContactPresenterFactory(module, dataManagerProvider);
  }
}
