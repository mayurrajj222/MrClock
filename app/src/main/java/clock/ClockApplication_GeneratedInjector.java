package clock;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ClockApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface ClockApplication_GeneratedInjector {
  void injectClockApplication(ClockApplication clockApplication);
}
