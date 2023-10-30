package com.example.core.utils





/**
Rather than having a global or base sealed class for routes that all features extend, each feature
should define its own sealed class for routes. This approach promotes modular design, as each
feature is self-contained and manages its own navigation routes.

```kotlin
sealed class ChatRoutes(val route: String) {
object Main : ChatRoutes("chat/main")
object Profile : ChatRoutes("chat/profile")
object Group : ChatRoutes("chat/group")
}
```


```
sealed class CoreRoutes(val route: String) {
object Home : CoreRoutes("home")
object Settings : CoreRoutes("settings")
}
```



```
sealed class QuizRoutes(val route: String) {
object Main : QuizRoutes("quiz/main")
object Results : QuizRoutes("quiz/results")
}
```


 */


sealed class Routes(val route: String) {
    object Home : Routes("home")


}



