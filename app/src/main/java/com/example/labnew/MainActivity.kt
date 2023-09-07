package com.example.labnew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.labnew.ui.theme.KeyBoardLABTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KeyBoardLABTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayLongText(longText)
                }
            }
        }
    }
}

@Composable
fun DisplayLongText(longText: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = longText, Modifier.verticalScroll(rememberScrollState()))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KeyBoardLABTheme {
        DisplayLongText(longText)
    }
}

const val longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Feugiat in ante metus dictum at tempor commodo. Gravida rutrum quisque non tellus orci ac. Dictumst quisque sagittis purus sit amet volutpat consequat mauris nunc. Egestas egestas fringilla phasellus faucibus scelerisque. Diam sollicitudin tempor id eu nisl nunc mi ipsum. Nascetur ridiculus mus mauris vitae ultricies leo integer malesuada nunc. A diam maecenas sed enim ut sem viverra. Mauris nunc congue nisi vitae suscipit. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Ac tincidunt vitae semper quis. Sagittis nisl rhoncus mattis rhoncus urna neque viverra. Vitae aliquet nec ullamcorper sit amet risus. Cursus turpis massa tincidunt dui ut. Vitae nunc sed velit dignissim sodales ut. Vel eros donec ac odio tempor orci. Sit amet luctus venenatis lectus magna. Sed viverra tellus in hac habitasse platea dictumst vestibulum rhoncus. Convallis aenean et tortor at risus viverra adipiscing.\n" +
        "\n" +
        "Pharetra diam sit amet nisl suscipit adipiscing bibendum est. Cras ornare arcu dui vivamus arcu felis bibendum. Fermentum leo vel orci porta non pulvinar neque laoreet. Ultrices mi tempus imperdiet nulla. Diam quis enim lobortis scelerisque. Nisl rhoncus mattis rhoncus urna neque. Vel risus commodo viverra maecenas accumsan. Sapien pellentesque habitant morbi tristique senectus. Facilisi etiam dignissim diam quis enim lobortis. Malesuada fames ac turpis egestas maecenas.\n" +
        "\n" +
        "Parturient montes nascetur ridiculus mus. Tristique senectus et netus et. Nisl purus in mollis nunc sed id. Mi ipsum faucibus vitae aliquet nec ullamcorper sit amet risus. Nibh nisl condimentum id venenatis a condimentum. Feugiat nibh sed pulvinar proin gravida hendrerit lectus a. Massa vitae tortor condimentum lacinia quis vel eros. Vulputate mi sit amet mauris commodo quis imperdiet massa tincidunt. Scelerisque eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada. In ante metus dictum at tempor commodo. In aliquam sem fringilla ut morbi. Mi sit amet mauris commodo quis imperdiet massa tincidunt nunc. Cras adipiscing enim eu turpis. Vitae semper quis lectus nulla.\n" +
        "\n" +
        "Diam ut venenatis tellus in metus vulputate. Tincidunt praesent semper feugiat nibh sed pulvinar proin gravida. Sed risus ultricies tristique nulla aliquet enim. Cras semper auctor neque vitae tempus quam pellentesque nec. Pharetra et ultrices neque ornare aenean. Nec nam aliquam sem et tortor. Nullam non nisi est sit amet facilisis magna etiam tempor. Augue mauris augue neque gravida in fermentum. Rutrum tellus pellentesque eu tincidunt tortor. Sit amet justo donec enim diam vulputate ut pharetra sit. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Egestas integer eget aliquet nibh praesent tristique magna. Diam volutpat commodo sed egestas egestas fringilla phasellus.\n" +
        "\n" +
        "At auctor urna nunc id cursus. Eget mauris pharetra et ultrices neque ornare aenean euismod. Porttitor rhoncus dolor purus non enim praesent elementum. Nullam non nisi est sit. Auctor urna nunc id cursus metus aliquam eleifend. Quisque non tellus orci ac auctor augue mauris augue. Auctor urna nunc id cursus. Tortor at risus viverra adipiscing at. Urna nec tincidunt praesent semper feugiat nibh sed pulvinar. Tortor dignissim convallis aenean et. Lorem ipsum dolor sit amet consectetur adipiscing elit. Ipsum consequat nisl vel pretium lectus quam id. Vulputate dignissim suspendisse in est ante. Erat nam at lectus urna duis convallis convallis. At varius vel pharetra vel turpis nunc.\n" +
        "\n" +
        "Non sodales neque sodales ut etiam sit amet. Quis ipsum suspendisse ultrices gravida dictum fusce ut. Ullamcorper malesuada proin libero nunc consequat interdum varius sit amet. Orci a scelerisque purus semper eget. Tortor at risus viverra adipiscing at in tellus integer feugiat. Ac placerat vestibulum lectus mauris ultrices eros. Aliquam id diam maecenas ultricies. Pulvinar neque laoreet suspendisse interdum consectetur. Cursus turpis massa tincidunt dui ut ornare lectus. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt. Amet cursus sit amet dictum. Vel facilisis volutpat est velit egestas dui id ornare arcu. Viverra suspendisse potenti nullam ac tortor vitae purus faucibus ornare.\n" +
        "\n" +
        "Dis parturient montes nascetur ridiculus. Lectus proin nibh nisl condimentum id venenatis a condimentum. Nulla facilisi cras fermentum odio eu feugiat. Viverra maecenas accumsan lacus vel facilisis volutpat. Est ante in nibh mauris cursus mattis molestie a. Vestibulum lorem sed risus ultricies. Nulla aliquet porttitor lacus luctus accumsan tortor. Convallis a cras semper auctor neque vitae tempus quam. Ac placerat vestibulum lectus mauris. Quis hendrerit dolor magna eget est lorem ipsum dolor sit. Pharetra vel turpis nunc eget lorem dolor sed. Enim ut sem viverra aliquet eget sit amet tellus cras. Leo integer malesuada nunc vel.\n" +
        "\n" +
        "A cras semper auctor neque vitae. Mauris cursus mattis molestie a. Volutpat est velit egestas dui id ornare arcu odio. Imperdiet dui accumsan sit amet nulla facilisi morbi tempus iaculis. Vel facilisis volutpat est velit. Eget nullam non nisi est sit amet facilisis magna etiam. Aliquam malesuada bibendum arcu vitae elementum. In egestas erat imperdiet sed. Mauris a diam maecenas sed enim. Vitae elementum curabitur vitae nunc sed velit dignissim sodales. Lobortis feugiat vivamus at augue eget arcu dictum varius. Eget velit aliquet sagittis id consectetur purus ut. In tellus integer feugiat scelerisque varius morbi enim nunc. Ut tristique et egestas quis ipsum. Vitae tortor condimentum lacinia quis vel. Diam maecenas sed enim ut sem viverra aliquet. Lorem ipsum dolor sit amet consectetur adipiscing elit pellentesque habitant. Molestie at elementum eu facilisis sed odio morbi quis.\n" +
        "\n" +
        "Diam ut venenatis tellus in metus vulputate. Ut etiam sit amet nisl purus in mollis nunc sed. Euismod elementum nisi quis eleifend. Quis vel eros donec ac odio tempor orci. Bibendum enim facilisis gravida neque. Dictum non consectetur a erat nam at. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Sit amet porttitor eget dolor morbi non arcu risus quis. Risus nullam eget felis eget nunc lobortis mattis aliquam. At risus viverra adipiscing at in tellus integer feugiat. Nibh nisl condimentum id venenatis. Aliquet sagittis id consectetur purus ut faucibus pulvinar elementum. Dictum varius duis at consectetur lorem donec massa. Ornare arcu dui vivamus arcu. Eu sem integer vitae justo eget magna. Arcu risus quis varius quam. Justo nec ultrices dui sapien.\n" +
        "\n" +
        "Maecenas accumsan lacus vel facilisis volutpat est velit egestas. Porta non pulvinar neque laoreet. Praesent elementum facilisis leo vel fringilla. Justo laoreet sit amet cursus sit amet dictum sit amet. Massa placerat duis ultricies lacus sed turpis. Ultrices neque ornare aenean euismod elementum nisi quis eleifend. Nibh praesent tristique magna sit. In est ante in nibh. Pulvinar sapien et ligula ullamcorper. Id ornare arcu odio ut sem. Convallis tellus id interdum velit laoreet id donec ultrices tincidunt. Egestas pretium aenean pharetra magna ac placerat vestibulum lectus. Et ligula ullamcorper malesuada proin libero nunc consequat interdum varius. Quis varius quam quisque id diam. Amet nisl suscipit adipiscing bibendum est ultricies."
