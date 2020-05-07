package peopleinteractive.com.peopleinteractive.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Street {
    @Expose
    @SerializedName("number")
    var number: Int?=null
    @Expose
    @SerializedName("name")
    val name: String?=null
}