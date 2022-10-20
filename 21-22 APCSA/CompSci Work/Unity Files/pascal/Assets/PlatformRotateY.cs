﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlatformRotateY : MonoBehaviour
{
    public float speed2 = 20f;
    // Use this for initialization

    // Update is called once per frame
    void Update()
    {

    }

    //every frame we hold the mouse down over this object
    private void OnMouseOver()
    {
        if (Input.GetMouseButton(0))
        {
            //left-click
            transform.Rotate(new Vector3(0, speed2 * Time.deltaTime, 0));
        }
        if (Input.GetMouseButton(1))
        {
            //right-click
            transform.Rotate(new Vector3(0, -speed2 * Time.deltaTime));
        }
    }
}
