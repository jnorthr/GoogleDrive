GoogleDrive
===========

Code fragments to use google drive to store and pick from; mostly javascript stuff. See Copyright (C) 2013 Daniel Lo Nigro (Daniel15) below !

See these links for more info :
https://github.com/jnorthr/GoogleDrive
https://cloud.google.com/console/project/apps~fleet-blend-496/apiui/api


Google Drive File Picker Example
================================
This is an example of how to use the Google Drive file picker and Google Drive API to retrieve 
files from Google Drive using pure JavaScript. At the time of writing (14th July 2013), Google have 
good examples for using these two APIs separately, but no documentation on using them together.

Note that this is just sample code, designed to be concise to demonstrate the API. In a production 
environment, you should include more error handling.

See a demo at http://stuff.dan.cx/js/filepicker/google/

Usage
=====
1. Get a Google Drive API key (refer to [Google's Quickstart guide](https://developers.google.com/drive/quickstart-js#step_1_enable_the_drive_api)
   for instructions).
2. Replace `PUT_YOUR_API_KEY_HERE` with your API key (listed under "Key for browser apps" in 
   Google's API console)
3. Replace `PUT_YOUR_NUMERIC_CLIENT_ID_HERE` with the numeric portion of your OAuth2 client ID 
   (xxxxxxxxxx.apps.googleusercontent.com)
4. Test out the code to ensure it works
5. Replcae the onSelect method with your own code

References
==========
 - [Google Picker API Developer's Guide](https://developers.google.com/picker/docs/)
 - [Google Drive SDK - API Reference](https://developers.google.com/drive/v2/reference/)
 - [JavaScript Client Library Reference](https://developers.google.com/api-client-library/javascript/reference/referencedocs)

Licence
=======
(The MIT licence)

Copyright (C) 2013 Daniel Lo Nigro (Daniel15)

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
of the Software, and to permit persons to whom the Software is furnished to do
so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.