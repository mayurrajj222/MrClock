// Generated by Dagger (https://dagger.dev).
package clock.data.repository;

import com.yassineabou.clock.data.local.AlarmDao;

import javax.inject.Provider;

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
public final class AlarmRepository_Factory implements Factory<AlarmRepository> {
  private final Provider<AlarmDao> alarmDaoProvider;

  public AlarmRepository_Factory(Provider<AlarmDao> alarmDaoProvider) {
    this.alarmDaoProvider = alarmDaoProvider;
  }

  @Override
  public AlarmRepository get() {
    return newInstance(alarmDaoProvider.get());
  }

  public static AlarmRepository_Factory create(Provider<AlarmDao> alarmDaoProvider) {
    return new AlarmRepository_Factory(alarmDaoProvider);
  }

  public static AlarmRepository newInstance(AlarmDao alarmDao) {
    return new AlarmRepository(alarmDao);
  }
}
