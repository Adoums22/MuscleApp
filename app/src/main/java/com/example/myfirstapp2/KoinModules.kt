import com.example.myfirstapp2.MyRepository
import com.example.myfirstapp2.MyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    // Définition de dépendances
    single { MyRepository() } // Exemple de dépendance singleton
    viewModel { MyViewModel(get()) } // Exemple d'utilisation de ViewModel avec une dépendance
}
