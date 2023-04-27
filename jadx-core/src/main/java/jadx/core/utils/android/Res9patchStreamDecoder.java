/**
 * Copyright 2014 Ryszard Wiśniewski <brut.alll@gmail.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jadx.core.utils.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Ryszard Wiśniewski "brut.alll@gmail.com"
 */
public class Res9patchStreamDecoder {

	public boolean decode(InputStream in, OutputStream out) {
		Bitmap bitmap = BitmapFactory.decodeStream(in);
		bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
		return true;
	}
}
