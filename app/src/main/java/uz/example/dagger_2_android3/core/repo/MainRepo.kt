package uz.example.dagger_2_android3.core.repoimport kotlinx.coroutines.Dispatchersimport uz.example.dagger_2_android3.core.model.TopHeadlineResponseimport uz.example.dagger_2_android3.core.network.NewsApiimport uz.example.dagger_2_android3.core.utils.ResultWrapperimport uz.example.dagger_2_android3.core.utils.parseResponseimport javax.inject.Injectclass MainRepo @Inject constructor (val api: NewsApi) {   suspend fun loadTopHeadline(): ResultWrapper<TopHeadlineResponse?, Any> {       return parseResponse(Dispatchers.IO, ){           api.loadTopHeadline("ru","b0b8f6eb9f36444bbcff95f092ba4d60")       }    }}