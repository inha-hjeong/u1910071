package app.delish.discover.vm

import app.delish.base.vm.MviViewModel
import com.elbehiry.model.IngredientItem

internal interface ViewEffect : MviViewModel.MviSideEffect {
    data class OpenIngredientsSheet(val ingredients : List<IngredientItem>) : ViewEffect
}
