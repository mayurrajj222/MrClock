// Generated by Dagger (https://dagger.dev).
package clock.data.workManager.factory;

import java.util.Map;

import javax.inject.Provider;

import androidx.work.ListenableWorker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class WrapperWorkerFactory_Factory implements Factory<WrapperWorkerFactory> {
  private final Provider<Map<Class<? extends ListenableWorker>, Provider<ChildWorkerFactory>>> workerFactoriesProvider;

  public WrapperWorkerFactory_Factory(
      Provider<Map<Class<? extends ListenableWorker>, Provider<ChildWorkerFactory>>> workerFactoriesProvider) {
    this.workerFactoriesProvider = workerFactoriesProvider;
  }

  @Override
  public WrapperWorkerFactory get() {
    return newInstance(workerFactoriesProvider.get());
  }

  public static WrapperWorkerFactory_Factory create(
      Provider<Map<Class<? extends ListenableWorker>, Provider<ChildWorkerFactory>>> workerFactoriesProvider) {
    return new WrapperWorkerFactory_Factory(workerFactoriesProvider);
  }

  public static WrapperWorkerFactory newInstance(
      Map<Class<? extends ListenableWorker>, Provider<ChildWorkerFactory>> workerFactories) {
    return new WrapperWorkerFactory(workerFactories);
  }
}
